package com.amooth.configuration;

import java.util.List;

public class ResultSet<T> {
    private final ResultStatus resultStatus;
    private final int count;
    private final List<T> results;

    public ResultSet(ResultStatus resultStatus) {
        this.resultStatus = resultStatus;
        count = 0;
        results = null;
    }

    public ResultSet(ResultStatus resultStatus, int count, List<T> results) {
        this.resultStatus = resultStatus;
        this.count = count;
        this.results = results;
    }

    public ResultStatus getResultStatus() {
        return resultStatus;
    }

    public int getCount() {
        return count;
    }

    public List<T> getResults() {
        return results;
    }
}
