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
 * Asynchronously delete [URLRedirect](https://shopify.dev/api/admin-graphql/latest/objects/UrlRedirect) 
 * objects in bulk by IDs.
 * Learn more about [URLRedirect](https://help.shopify.com/en/manual/online-store/menus-and-links/url-redirect) 
 * objects.
 */
public class UrlRedirectBulkDeleteByIdsGraphQLQuery extends GraphQLQuery {
  public UrlRedirectBulkDeleteByIdsGraphQLQuery(List<String> ids, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (ids != null || fieldsSet.contains("ids")) {
        getInput().put("ids", ids);
    }
  }

  public UrlRedirectBulkDeleteByIdsGraphQLQuery(List<String> ids, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (ids != null || fieldsSet.contains("ids")) {
        getInput().put("ids", ids);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public UrlRedirectBulkDeleteByIdsGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "urlRedirectBulkDeleteByIds";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private List<String> ids;

    private String queryName;

    public UrlRedirectBulkDeleteByIdsGraphQLQuery build() {
      return new UrlRedirectBulkDeleteByIdsGraphQLQuery(ids, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * A list of [`URLRedirect`](
     *             https://help.shopify.com/en/manual/online-store/menus-and-links/url-redirect
     *           ) object IDs to delete.
     */
    public Builder ids(List<String> ids) {
      this.ids = ids;
      this.fieldsSet.add("ids");
      return this;
    }

    /**
     * A list of [`URLRedirect`](
     *             https://help.shopify.com/en/manual/online-store/menus-and-links/url-redirect
     *           ) object IDs to delete.
     */
    public Builder idsReference(String variableRef) {
      this.variableReferences.put("ids", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID"))))).build());
      this.fieldsSet.add("ids");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
