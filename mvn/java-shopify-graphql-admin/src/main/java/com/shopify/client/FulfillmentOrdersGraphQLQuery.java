package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.FulfillmentOrderSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class FulfillmentOrdersGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrdersGraphQLQuery(Boolean includeClosed, Integer first, String after,
      Integer last, String before, Boolean reverse, FulfillmentOrderSortKeys sortKey, String query,
      String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (includeClosed != null || fieldsSet.contains("includeClosed")) {
        getInput().put("includeClosed", includeClosed);
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
    }
  }

  public FulfillmentOrdersGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrders";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private Boolean includeClosed;

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private Boolean reverse;

    private FulfillmentOrderSortKeys sortKey;

    private String query;

    private String queryName;

    public FulfillmentOrdersGraphQLQuery build() {
      return new FulfillmentOrdersGraphQLQuery(includeClosed, first, after, last, before, reverse, sortKey, query, queryName, fieldsSet);
               
    }

    
    public Builder includeClosed(Boolean includeClosed) {
      this.includeClosed = includeClosed;
      this.fieldsSet.add("includeClosed");
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

    
    public Builder sortKey(FulfillmentOrderSortKeys sortKey) {
      this.sortKey = sortKey;
      this.fieldsSet.add("sortKey");
      return this;
    }

    
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
