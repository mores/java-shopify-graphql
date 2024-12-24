package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.SubscriptionBillingCyclesDateRangeSelector;
import com.shopify.types.SubscriptionBillingCyclesIndexRangeSelector;
import com.shopify.types.SubscriptionBillingCyclesSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class SubscriptionBillingCyclesGraphQLQuery extends GraphQLQuery {
  public SubscriptionBillingCyclesGraphQLQuery(String contractId,
      SubscriptionBillingCyclesDateRangeSelector billingCyclesDateRangeSelector,
      SubscriptionBillingCyclesIndexRangeSelector billingCyclesIndexRangeSelector, Integer first,
      String after, Integer last, String before, Boolean reverse,
      SubscriptionBillingCyclesSortKeys sortKey, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (contractId != null || fieldsSet.contains("contractId")) {
        getInput().put("contractId", contractId);
    }if (billingCyclesDateRangeSelector != null || fieldsSet.contains("billingCyclesDateRangeSelector")) {
        getInput().put("billingCyclesDateRangeSelector", billingCyclesDateRangeSelector);
    }if (billingCyclesIndexRangeSelector != null || fieldsSet.contains("billingCyclesIndexRangeSelector")) {
        getInput().put("billingCyclesIndexRangeSelector", billingCyclesIndexRangeSelector);
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

  public SubscriptionBillingCyclesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "subscriptionBillingCycles";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String contractId;

    private SubscriptionBillingCyclesDateRangeSelector billingCyclesDateRangeSelector;

    private SubscriptionBillingCyclesIndexRangeSelector billingCyclesIndexRangeSelector;

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private Boolean reverse;

    private SubscriptionBillingCyclesSortKeys sortKey;

    private String queryName;

    public SubscriptionBillingCyclesGraphQLQuery build() {
      return new SubscriptionBillingCyclesGraphQLQuery(contractId, billingCyclesDateRangeSelector, billingCyclesIndexRangeSelector, first, after, last, before, reverse, sortKey, queryName, fieldsSet);
               
    }

    
    public Builder contractId(String contractId) {
      this.contractId = contractId;
      this.fieldsSet.add("contractId");
      return this;
    }

    
    public Builder billingCyclesDateRangeSelector(
        SubscriptionBillingCyclesDateRangeSelector billingCyclesDateRangeSelector) {
      this.billingCyclesDateRangeSelector = billingCyclesDateRangeSelector;
      this.fieldsSet.add("billingCyclesDateRangeSelector");
      return this;
    }

    
    public Builder billingCyclesIndexRangeSelector(
        SubscriptionBillingCyclesIndexRangeSelector billingCyclesIndexRangeSelector) {
      this.billingCyclesIndexRangeSelector = billingCyclesIndexRangeSelector;
      this.fieldsSet.add("billingCyclesIndexRangeSelector");
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

    
    public Builder sortKey(SubscriptionBillingCyclesSortKeys sortKey) {
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
