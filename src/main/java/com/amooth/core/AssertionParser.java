package com.amooth.core;

import com.sun.jersey.core.util.Base64;

import java.io.UnsupportedEncodingException;

public class AssertionParser {

    private final String encodedAssertion;
    private final String assertion;

    public AssertionParser(String encodedAssertion) {
        this.encodedAssertion = encodedAssertion;
        this.assertion = decodeAssertion(encodedAssertion);
    }

    private String decodeAssertion(String encodedXmlString) {
        try {
            Base64 base64Decoder = new Base64();
            byte[] xmlBytes = encodedXmlString.getBytes("UTF-8");
            byte[] base64DecodedByteArray = base64Decoder.decode(xmlBytes);
            String decodedResponse = new String(base64DecodedByteArray, 0, base64DecodedByteArray.length, "UTF-8");

            return decodedResponse;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public String parseSignatureValue(){
        return getTagContents(this.assertion, "<ds:SignatureValue>", "</ds:SignatureValue>");
    }

    public String parseNameAttribute(){
        String nameAttribute = getTagContents(this.assertion, "<Attribute Name=\"Name\">", "</Attribute>");
        String name = getTagContents(nameAttribute, "<AttributeValue>", "</AttributeValue>");
        return name;
    }

    private String getTagContents(String xml, String startTag, String stopTag){
        int startIndex = xml.indexOf(startTag);
        int stopIndex = xml.indexOf(stopTag, startIndex);

        return xml.substring(startIndex + startTag.length(), stopIndex);

    }
}
