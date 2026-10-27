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
 * Activates a customer account using the full activation URL from the [`customerCreate`](https://shopify.dev/docs/api/storefront/current/mutations/customerCreate)
 * mutation. This approach simplifies activation by accepting the complete URL
 * directly, eliminating the need to parse it for the customer ID and activation
 * token. Returns a [`CustomerAccessToken`](https://shopify.dev/docs/api/storefront/current/objects/CustomerAccessToken)
 * for authenticating subsequent requests.
 *   
 * > Caution:
 * > Store the returned access token securely. It grants access to the customer's account data.
 */
public class CustomerActivateByUrlGraphQLQuery extends GraphQLQuery {
  public CustomerActivateByUrlGraphQLQuery(String activationUrl, String password, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (activationUrl != null || fieldsSet.contains("activationUrl")) {
        getInput().put("activationUrl", activationUrl);
    }if (password != null || fieldsSet.contains("password")) {
        getInput().put("password", password);
    }
  }

  public CustomerActivateByUrlGraphQLQuery(String activationUrl, String password, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (activationUrl != null || fieldsSet.contains("activationUrl")) {
        getInput().put("activationUrl", activationUrl);
    }if (password != null || fieldsSet.contains("password")) {
        getInput().put("password", password);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CustomerActivateByUrlGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerActivateByUrl";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String activationUrl;

    private String password;

    private String queryName;

    public CustomerActivateByUrlGraphQLQuery build() {
      return new CustomerActivateByUrlGraphQLQuery(activationUrl, password, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The customer activation URL.
     */
    public Builder activationUrl(String activationUrl) {
      this.activationUrl = activationUrl;
      this.fieldsSet.add("activationUrl");
      return this;
    }

    /**
     * The customer activation URL.
     */
    public Builder activationUrlReference(String variableRef) {
      this.variableReferences.put("activationUrl", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("URL"))).build());
      this.fieldsSet.add("activationUrl");
      return this;
    }

    /**
     * A new password set during activation.
     */
    public Builder password(String password) {
      this.password = password;
      this.fieldsSet.add("password");
      return this;
    }

    /**
     * A new password set during activation.
     */
    public Builder passwordReference(String variableRef) {
      this.variableReferences.put("password", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("password");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
