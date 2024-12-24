package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MarketingActivitySortKeys;
import com.shopify.types.UTMInput;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class MarketingActivitiesGraphQLQuery extends GraphQLQuery {
  public MarketingActivitiesGraphQLQuery(List<String> marketingActivityIds, List<String> remoteIds,
      UTMInput utm, Integer first, String after, Integer last, String before, Boolean reverse,
      MarketingActivitySortKeys sortKey, String query, String savedSearchId, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (marketingActivityIds != null || fieldsSet.contains("marketingActivityIds")) {
        getInput().put("marketingActivityIds", marketingActivityIds);
    }if (remoteIds != null || fieldsSet.contains("remoteIds")) {
        getInput().put("remoteIds", remoteIds);
    }if (utm != null || fieldsSet.contains("utm")) {
        getInput().put("utm", utm);
    }if (first != null || fieldsSet.contains("first")) {
        getInput().put("first", first);
    }if (after != null || fieldsSet.contains("after")) {
        getInput().put("after", after);
    }if (last != null || fieldsSet.contains("last")) {
        getInput().put("last", last);
    }if (before != null || fieldsSet.contains("before")) {
        getInput().put("before", before);
    }if (reverse != null || fieldsSet.contains("reverse")) {
        getInput().put("reverse", reverse);
    }if (sortKey != null || fieldsSet.contains("sortKey")) {
        getInput().put("sortKey", sortKey);
    }if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }if (savedSearchId != null || fieldsSet.contains("savedSearchId")) {
        getInput().put("savedSearchId", savedSearchId);
    }
  }

  public MarketingActivitiesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "marketingActivities";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<String> marketingActivityIds;

    private List<String> remoteIds;

    private UTMInput utm;

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private Boolean reverse;

    private MarketingActivitySortKeys sortKey;

    private String query;

    private String savedSearchId;

    private String queryName;

    public MarketingActivitiesGraphQLQuery build() {
      return new MarketingActivitiesGraphQLQuery(marketingActivityIds, remoteIds, utm, first, after, last, before, reverse, sortKey, query, savedSearchId, queryName, fieldsSet);
               
    }

    
    public Builder marketingActivityIds(List<String> marketingActivityIds) {
      this.marketingActivityIds = marketingActivityIds;
      this.fieldsSet.add("marketingActivityIds");
      return this;
    }

    
    public Builder remoteIds(List<String> remoteIds) {
      this.remoteIds = remoteIds;
      this.fieldsSet.add("remoteIds");
      return this;
    }

    
    public Builder utm(UTMInput utm) {
      this.utm = utm;
      this.fieldsSet.add("utm");
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

    
    public Builder reverse(Boolean reverse) {
      this.reverse = reverse;
      this.fieldsSet.add("reverse");
      return this;
    }

    
    public Builder sortKey(MarketingActivitySortKeys sortKey) {
      this.sortKey = sortKey;
      this.fieldsSet.add("sortKey");
      return this;
    }

    
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
      return this;
    }

    
    public Builder savedSearchId(String savedSearchId) {
      this.savedSearchId = savedSearchId;
      this.fieldsSet.add("savedSearchId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
