package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class CustomerSegmentMembersGraphQLQuery extends GraphQLQuery {
  public CustomerSegmentMembersGraphQLQuery(String segmentId, String query, String queryId,
      String timezone, Boolean reverse, String sortKey, Integer first, String after, Integer last,
      String before, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (segmentId != null || fieldsSet.contains("segmentId")) {
        getInput().put("segmentId", segmentId);
    }if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }if (queryId != null || fieldsSet.contains("queryId")) {
        getInput().put("queryId", queryId);
    }if (timezone != null || fieldsSet.contains("timezone")) {
        getInput().put("timezone", timezone);
    }if (reverse != null || fieldsSet.contains("reverse")) {
        getInput().put("reverse", reverse);
    }if (sortKey != null || fieldsSet.contains("sortKey")) {
        getInput().put("sortKey", sortKey);
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

  public CustomerSegmentMembersGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "customerSegmentMembers";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String segmentId;

    private String query;

    private String queryId;

    private String timezone;

    private Boolean reverse;

    private String sortKey;

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private String queryName;

    public CustomerSegmentMembersGraphQLQuery build() {
      return new CustomerSegmentMembersGraphQLQuery(segmentId, query, queryId, timezone, reverse, sortKey, first, after, last, before, queryName, fieldsSet);
               
    }

    
    public Builder segmentId(String segmentId) {
      this.segmentId = segmentId;
      this.fieldsSet.add("segmentId");
      return this;
    }

    
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
      return this;
    }

    
    public Builder queryId(String queryId) {
      this.queryId = queryId;
      this.fieldsSet.add("queryId");
      return this;
    }

    
    public Builder timezone(String timezone) {
      this.timezone = timezone;
      this.fieldsSet.add("timezone");
      return this;
    }

    
    public Builder reverse(Boolean reverse) {
      this.reverse = reverse;
      this.fieldsSet.add("reverse");
      return this;
    }

    
    public Builder sortKey(String sortKey) {
      this.sortKey = sortKey;
      this.fieldsSet.add("sortKey");
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
