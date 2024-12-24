package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.FulfillmentOrderAssignmentStatus;
import com.shopify.types.FulfillmentOrderSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class AssignedFulfillmentOrdersGraphQLQuery extends GraphQLQuery {
  public AssignedFulfillmentOrdersGraphQLQuery(FulfillmentOrderAssignmentStatus assignmentStatus,
      List<String> locationIds, Integer first, String after, Integer last, String before,
      Boolean reverse, FulfillmentOrderSortKeys sortKey, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (assignmentStatus != null || fieldsSet.contains("assignmentStatus")) {
        getInput().put("assignmentStatus", assignmentStatus);
    }if (locationIds != null || fieldsSet.contains("locationIds")) {
        getInput().put("locationIds", locationIds);
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
    }
  }

  public AssignedFulfillmentOrdersGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "assignedFulfillmentOrders";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private FulfillmentOrderAssignmentStatus assignmentStatus;

    private List<String> locationIds;

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private Boolean reverse;

    private FulfillmentOrderSortKeys sortKey;

    private String queryName;

    public AssignedFulfillmentOrdersGraphQLQuery build() {
      return new AssignedFulfillmentOrdersGraphQLQuery(assignmentStatus, locationIds, first, after, last, before, reverse, sortKey, queryName, fieldsSet);
               
    }

    
    public Builder assignmentStatus(FulfillmentOrderAssignmentStatus assignmentStatus) {
      this.assignmentStatus = assignmentStatus;
      this.fieldsSet.add("assignmentStatus");
      return this;
    }

    
    public Builder locationIds(List<String> locationIds) {
      this.locationIds = locationIds;
      this.fieldsSet.add("locationIds");
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

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
