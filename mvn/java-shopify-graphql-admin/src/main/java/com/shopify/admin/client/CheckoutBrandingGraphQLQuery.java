package com.shopify.admin.client;

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
 * Returns the visual customizations for checkout for a given [checkout profile](https://shopify.dev/docs/api/admin-graphql/latest/objects/CheckoutProfile).
 *   
 * To update checkout branding settings, use the [`checkoutBrandingUpsert`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/checkoutBrandingUpsert)
 * mutation. Learn more about [customizing checkout's
 * appearance](https://shopify.dev/docs/apps/build/checkout/styling).
 */
public class CheckoutBrandingGraphQLQuery extends GraphQLQuery {
  public CheckoutBrandingGraphQLQuery(String checkoutProfileId, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (checkoutProfileId != null || fieldsSet.contains("checkoutProfileId")) {
        getInput().put("checkoutProfileId", checkoutProfileId);
    }
  }

  public CheckoutBrandingGraphQLQuery(String checkoutProfileId, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (checkoutProfileId != null || fieldsSet.contains("checkoutProfileId")) {
        getInput().put("checkoutProfileId", checkoutProfileId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CheckoutBrandingGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "checkoutBranding";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String checkoutProfileId;

    private String queryName;

    public CheckoutBrandingGraphQLQuery build() {
      return new CheckoutBrandingGraphQLQuery(checkoutProfileId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * A globally-unique identifier.
     */
    public Builder checkoutProfileId(String checkoutProfileId) {
      this.checkoutProfileId = checkoutProfileId;
      this.fieldsSet.add("checkoutProfileId");
      return this;
    }

    /**
     * A globally-unique identifier.
     */
    public Builder checkoutProfileIdReference(String variableRef) {
      this.variableReferences.put("checkoutProfileId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("checkoutProfileId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
