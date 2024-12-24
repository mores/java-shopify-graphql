package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class SegmentValueSuggestionsGraphQLQuery extends GraphQLQuery {
  public SegmentValueSuggestionsGraphQLQuery(String search, String filterQueryName,
      String functionParameterQueryName, Integer first, String after, Integer last, String before,
      String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (search != null || fieldsSet.contains("search")) {
        getInput().put("search", search);
    }if (filterQueryName != null || fieldsSet.contains("filterQueryName")) {
        getInput().put("filterQueryName", filterQueryName);
    }if (functionParameterQueryName != null || fieldsSet.contains("functionParameterQueryName")) {
        getInput().put("functionParameterQueryName", functionParameterQueryName);
    }if (first != null || fieldsSet.contains("first")) {
        getInput().put("first", first);
    }if (after != null || fieldsSet.contains("after")) {
        getInput().put("after", after);
    }if (last != null || fieldsSet.contains("last")) {
        getInput().put("last", last);
    }if (before != null || fieldsSet.contains("before")) {
        getInput().put("before", before);
    }
  }

  public SegmentValueSuggestionsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "segmentValueSuggestions";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String search;

    private String filterQueryName;

    private String functionParameterQueryName;

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private String queryName;

    public SegmentValueSuggestionsGraphQLQuery build() {
      return new SegmentValueSuggestionsGraphQLQuery(search, filterQueryName, functionParameterQueryName, first, after, last, before, queryName, fieldsSet);
               
    }

    
    public Builder search(String search) {
      this.search = search;
      this.fieldsSet.add("search");
      return this;
    }

    
    public Builder filterQueryName(String filterQueryName) {
      this.filterQueryName = filterQueryName;
      this.fieldsSet.add("filterQueryName");
      return this;
    }

    
    public Builder functionParameterQueryName(String functionParameterQueryName) {
      this.functionParameterQueryName = functionParameterQueryName;
      this.fieldsSet.add("functionParameterQueryName");
      return this;
    }

    
    public Builder first(Integer first) {
      this.first = first;
      this.fieldsSet.add("first");
      return this;
    }

    
    public Builder after(String after) {
      this.after = after;
      this.fieldsSet.add("after");
      return this;
    }

    
    public Builder last(Integer last) {
      this.last = last;
      this.fieldsSet.add("last");
      return this;
    }

    
    public Builder before(String before) {
      this.before = before;
      this.fieldsSet.add("before");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
