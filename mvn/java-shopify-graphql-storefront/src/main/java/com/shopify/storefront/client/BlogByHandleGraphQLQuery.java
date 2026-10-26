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
 * its handle. A blog organizes
 * [`Article`](https://shopify.dev/docs/api/storefront/current/objects/Article)
 * objects for the online store and includes author information,
 * [`SEO`](https://shopify.dev/docs/api/storefront/current/objects/SEO) settings, and custom [`Metafield`](https://shopify.dev/docs/api/storefront/current/objects/Metafield) objects.
 */
public class BlogByHandleGraphQLQuery extends GraphQLQuery {
  public BlogByHandleGraphQLQuery(String handle, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }
  }

  public BlogByHandleGraphQLQuery(String handle, String queryName, Set<String> fieldsSet,
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

  public BlogByHandleGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "blogByHandle";
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

    public BlogByHandleGraphQLQuery build() {
      return new BlogByHandleGraphQLQuery(handle, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The handle of the blog.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      this.fieldsSet.add("handle");
      return this;
    }

    /**
     * The handle of the blog.
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
