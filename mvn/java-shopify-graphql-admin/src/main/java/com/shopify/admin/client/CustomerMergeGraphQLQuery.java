package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CustomerMergeOverrideFields;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Merges two customers.
 */
public class CustomerMergeGraphQLQuery extends GraphQLQuery {
  public CustomerMergeGraphQLQuery(String customerOneId, String customerTwoId,
      CustomerMergeOverrideFields overrideFields, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerOneId != null || fieldsSet.contains("customerOneId")) {
        getInput().put("customerOneId", customerOneId);
    }if (customerTwoId != null || fieldsSet.contains("customerTwoId")) {
        getInput().put("customerTwoId", customerTwoId);
    }if (overrideFields != null || fieldsSet.contains("overrideFields")) {
        getInput().put("overrideFields", overrideFields);
    }
  }

  public CustomerMergeGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerMerge";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String customerOneId;

    private String customerTwoId;

    private CustomerMergeOverrideFields overrideFields;

    private String queryName;

    public CustomerMergeGraphQLQuery build() {
      return new CustomerMergeGraphQLQuery(customerOneId, customerTwoId, overrideFields, queryName, fieldsSet);
               
    }

    /**
     * The ID of the first customer that will be merged.
     */
    public Builder customerOneId(String customerOneId) {
      this.customerOneId = customerOneId;
      this.fieldsSet.add("customerOneId");
      return this;
    }

    /**
     * The ID of the second customer that will be merged.
     */
    public Builder customerTwoId(String customerTwoId) {
      this.customerTwoId = customerTwoId;
      this.fieldsSet.add("customerTwoId");
      return this;
    }

    /**
     * The fields to override the default customer merge rules.
     */
    public Builder overrideFields(CustomerMergeOverrideFields overrideFields) {
      this.overrideFields = overrideFields;
      this.fieldsSet.add("overrideFields");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
