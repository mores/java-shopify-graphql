package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CustomerMergeOverrideFields;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Merges two customers.
 *   
 * The `customerOneId` and `customerTwoId` arguments don't guarantee which customer is kept. Shopify
 * selects the resulting customer in this order:
 * 1. If `overrideFields.customerIdOfEmailToKeep` is provided and valid, then the selected customer is kept.
 * 2. If exactly one customer has an email address, then that customer is kept.
 * 3. If both customers have email addresses, then account state and email marketing consent determine
 *    the customer that's kept: an `enabled` account wins over other account states; otherwise, an
 *    `invited` account can win when consent doesn't already prefer `subscribed` or `pending`; otherwise
 *    the consent result is used. If those rules don't prefer either customer, then `customerTwoId` is kept.
 * 4. If neither customer has an email address, then `customerTwoId` is kept.
 *   
 * Use `customerMergePreview` and `resultingCustomerId` to check which customer will be kept before merging.
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

  public CustomerMergeGraphQLQuery(String customerOneId, String customerTwoId,
      CustomerMergeOverrideFields overrideFields, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (customerOneId != null || fieldsSet.contains("customerOneId")) {
        getInput().put("customerOneId", customerOneId);
    }if (customerTwoId != null || fieldsSet.contains("customerTwoId")) {
        getInput().put("customerTwoId", customerTwoId);
    }if (overrideFields != null || fieldsSet.contains("overrideFields")) {
        getInput().put("overrideFields", overrideFields);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
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

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String customerOneId;

    private String customerTwoId;

    private CustomerMergeOverrideFields overrideFields;

    private String queryName;

    public CustomerMergeGraphQLQuery build() {
      return new CustomerMergeGraphQLQuery(customerOneId, customerTwoId, overrideFields, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of one customer to merge. This customer isn't guaranteed to be kept.
     */
    public Builder customerOneId(String customerOneId) {
      this.customerOneId = customerOneId;
      this.fieldsSet.add("customerOneId");
      return this;
    }

    /**
     * The ID of one customer to merge. This customer isn't guaranteed to be kept.
     */
    public Builder customerOneIdReference(String variableRef) {
      this.variableReferences.put("customerOneId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("customerOneId");
      return this;
    }

    /**
     * The ID of another customer to merge. This customer is kept when neither customer has an email address.
     */
    public Builder customerTwoId(String customerTwoId) {
      this.customerTwoId = customerTwoId;
      this.fieldsSet.add("customerTwoId");
      return this;
    }

    /**
     * The ID of another customer to merge. This customer is kept when neither customer has an email address.
     */
    public Builder customerTwoIdReference(String variableRef) {
      this.variableReferences.put("customerTwoId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("customerTwoId");
      return this;
    }

    /**
     * The field-specific overrides for default customer merge rules.
     */
    public Builder overrideFields(CustomerMergeOverrideFields overrideFields) {
      this.overrideFields = overrideFields;
      this.fieldsSet.add("overrideFields");
      return this;
    }

    /**
     * The field-specific overrides for default customer merge rules.
     */
    public Builder overrideFieldsReference(String variableRef) {
      this.variableReferences.put("overrideFields", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("CustomerMergeOverrideFields")).build());
      this.fieldsSet.add("overrideFields");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
