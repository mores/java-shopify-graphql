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
 * Retrieves a [`Page`](https://shopify.dev/docs/api/storefront/current/objects/Page) by its [`handle`](https://shopify.dev/docs/api/storefront/current/queries/page#arguments-handle) or [`id`](https://shopify.dev/docs/api/storefront/current/queries/page#arguments-id).
 * Pages are static content pages that merchants display outside their product
 * catalog, such as "About Us," "Contact," or policy pages.
 *   
 * The returned page includes information such as the [HTML body content](https://shopify.dev/docs/api/storefront/current/queries/page#returns-Page.fields.body),
 * [`SEO`](https://shopify.dev/docs/api/storefront/current/objects/SEO)
 * information, and any associated [`Metafield`](https://shopify.dev/docs/api/storefront/current/objects/Metafield) objects.
 */
public class PageGraphQLQuery extends GraphQLQuery {
  public PageGraphQLQuery(String handle, String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public PageGraphQLQuery(String handle, String id, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public PageGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "page";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String handle;

    private String id;

    private String queryName;

    public PageGraphQLQuery build() {
      return new PageGraphQLQuery(handle, id, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The handle of the `Page`.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      this.fieldsSet.add("handle");
      return this;
    }

    /**
     * The handle of the `Page`.
     */
    public Builder handleReference(String variableRef) {
      this.variableReferences.put("handle", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("handle");
      return this;
    }

    /**
     * The ID of the `Page`.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the `Page`.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("ID")).build());
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
