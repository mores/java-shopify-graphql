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
 * Retrieves a [`Blog`](https://shopify.dev/docs/api/storefront/current/objects/Blog) by
 * its handle or ID. A blog organizes
 * [`Article`](https://shopify.dev/docs/api/storefront/current/objects/Article)
 * objects for the online store and includes author information,
 * [`SEO`](https://shopify.dev/docs/api/storefront/current/objects/SEO) settings, and custom [`Metafield`](https://shopify.dev/docs/api/storefront/current/objects/Metafield) objects.
 */
public class BlogGraphQLQuery extends GraphQLQuery {
  public BlogGraphQLQuery(String handle, String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public BlogGraphQLQuery(String handle, String id, String queryName, Set<String> fieldsSet,
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

  public BlogGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "blog";
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

    public BlogGraphQLQuery build() {
      return new BlogGraphQLQuery(handle, id, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The handle of the `Blog`.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      this.fieldsSet.add("handle");
      return this;
    }

    /**
     * The handle of the `Blog`.
     */
    public Builder handleReference(String variableRef) {
      this.variableReferences.put("handle", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("handle");
      return this;
    }

    /**
     * The ID of the `Blog`.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the `Blog`.
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
