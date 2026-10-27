package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
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
 * Sends a reset password email to the customer. The email contains a reset
 * password URL and token that you can pass to the [`customerResetByUrl`](https://shopify.dev/docs/api/storefront/current/mutations/customerResetByUrl) or [`customerReset`](https://shopify.dev/docs/api/storefront/current/mutations/customerReset)
 * mutation to reset the customer's password.
 *   
 * This mutation is throttled by IP. With private access, you can provide a
 * [`Shopify-Storefront-Buyer-IP`
 * header](https://shopify.dev/docs/api/usage/authentication#optional-ip-header)
 * instead of the request IP. The header is case-sensitive.
 *   
 * > Caution:
 * > Ensure the value provided to `Shopify-Storefront-Buyer-IP` is trusted.
 * Unthrottled access to this mutation presents a security risk.
 */
public class CustomerRecoverGraphQLQuery extends GraphQLQuery {
  public CustomerRecoverGraphQLQuery(String email, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (email != null || fieldsSet.contains("email")) {
        getInput().put("email", email);
    }
  }

  public CustomerRecoverGraphQLQuery(String email, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (email != null || fieldsSet.contains("email")) {
        getInput().put("email", email);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CustomerRecoverGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerRecover";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String email;

    private String queryName;

    public CustomerRecoverGraphQLQuery build() {
      return new CustomerRecoverGraphQLQuery(email, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The email address of the customer to recover.
     */
    public Builder email(String email) {
      this.email = email;
      this.fieldsSet.add("email");
      return this;
    }

    /**
     * The email address of the customer to recover.
     */
    public Builder emailReference(String variableRef) {
      this.variableReferences.put("email", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("email");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
