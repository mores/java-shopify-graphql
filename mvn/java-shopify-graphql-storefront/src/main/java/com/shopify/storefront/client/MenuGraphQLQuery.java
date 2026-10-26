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
 * Retrieves a [`Menu`](https://shopify.dev/docs/api/storefront/current/objects/Menu) by
 * its handle. Menus are [hierarchical navigation
 * structures](https://help.shopify.com/manual/online-store/menus-and-links) that
 * merchants configure for their storefront, such as header and footer navigation.
 *   
 * Each menu contains
 * [`MenuItem`](https://shopify.dev/docs/api/storefront/current/objects/MenuItem)
 * objects that can nest up to three levels deep, with each item linking to [collections](https://shopify.dev/docs/api/storefront/current/objects/Collection),
 * [products](https://shopify.dev/docs/api/storefront/current/objects/Product),
 * [pages](https://shopify.dev/docs/api/storefront/current/objects/Page),
 * [blogs](https://shopify.dev/docs/api/storefront/current/objects/Blog), or external URLs.
 */
public class MenuGraphQLQuery extends GraphQLQuery {
  public MenuGraphQLQuery(String handle, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }
  }

  public MenuGraphQLQuery(String handle, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public MenuGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "menu";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String handle;

    private String queryName;

    public MenuGraphQLQuery build() {
      return new MenuGraphQLQuery(handle, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The navigation menu's handle.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      this.fieldsSet.add("handle");
      return this;
    }

    /**
     * The navigation menu's handle.
     */
    public Builder handleReference(String variableRef) {
      this.variableReferences.put("handle", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("handle");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
