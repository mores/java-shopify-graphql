package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ConsentPolicyInput;
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
 * Update or create consent policies in bulk.
 */
public class ConsentPolicyUpdateGraphQLQuery extends GraphQLQuery {
  public ConsentPolicyUpdateGraphQLQuery(List<ConsentPolicyInput> consentPolicies, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (consentPolicies != null || fieldsSet.contains("consentPolicies")) {
        getInput().put("consentPolicies", consentPolicies);
    }
  }

  public ConsentPolicyUpdateGraphQLQuery(List<ConsentPolicyInput> consentPolicies, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (consentPolicies != null || fieldsSet.contains("consentPolicies")) {
        getInput().put("consentPolicies", consentPolicies);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public ConsentPolicyUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "consentPolicyUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private List<ConsentPolicyInput> consentPolicies;

    private String queryName;

    public ConsentPolicyUpdateGraphQLQuery build() {
      return new ConsentPolicyUpdateGraphQLQuery(consentPolicies, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The consent policies to update or create. If the country and region matches
     * an existing consent policy, then the consent policy is updated. Otherwise, a
     * new consent policy is created.
     */
    public Builder consentPolicies(List<ConsentPolicyInput> consentPolicies) {
      this.consentPolicies = consentPolicies;
      this.fieldsSet.add("consentPolicies");
      return this;
    }

    /**
     * The consent policies to update or create. If the country and region matches
     * an existing consent policy, then the consent policy is updated. Otherwise, a
     * new consent policy is created.
     */
    public Builder consentPoliciesReference(String variableRef) {
      this.variableReferences.put("consentPolicies", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ConsentPolicyInput"))))).build());
      this.fieldsSet.add("consentPolicies");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
