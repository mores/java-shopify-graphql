package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ConsentPolicyInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
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

    private List<ConsentPolicyInput> consentPolicies;

    private String queryName;

    public ConsentPolicyUpdateGraphQLQuery build() {
      return new ConsentPolicyUpdateGraphQLQuery(consentPolicies, queryName, fieldsSet);
               
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

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
