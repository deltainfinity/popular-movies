package com.siqute.android.popularmovies.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TMDBJson {

    private Integer page;
    private Integer totalResults;
    private Integer totalPages;
    private List<MovieJson> results = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public List<MovieJson> getResults() {
        return results;
    }

    public void setResults(List<MovieJson> results) {
        this.results = results;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}