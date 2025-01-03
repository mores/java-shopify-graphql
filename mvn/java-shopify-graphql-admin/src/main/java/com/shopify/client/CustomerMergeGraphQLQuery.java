package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CustomerMergeOverrideFields;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


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

    
    public Builder customerOneId(String customerOneId) {
      this.customerOneId = customerOneId;
      this.fieldsSet.add("customerOneId");
      return this;
    }

    
    public Builder customerTwoId(String customerTwoId) {
      this.customerTwoId = customerTwoId;
      this.fieldsSet.add("customerTwoId");
      return this;
    }

    
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
