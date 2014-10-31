package com.amooth.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class KinveyApiFilter implements Filter {

    private boolean usingApiKey;
    private String apiKey;

    public KinveyApiFilter(String apiKey, boolean usingApiKey) {
        this.apiKey = apiKey;
        this.usingApiKey = usingApiKey;
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if (!usingApiKey){
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            HttpServletRequest httpServletRequest =
                    (HttpServletRequest) servletRequest;
            String apiKeyHeader = httpServletRequest.getHeader("x-api-key");
            if (apiKeyHeader == null || apiKeyHeader.equals("")) {
                throw new RuntimeException("Missing X-API-Key Header");
            }

            if (!apiKeyHeader.equals(apiKey)){
                throw new RuntimeException("Unauthorized");
            }

            filterChain.doFilter(httpServletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
