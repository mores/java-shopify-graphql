package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.PageUpdateInput;
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
 * Updates an existing page's content and settings.
 *   
 * For example, merchants can update their "Shipping Policy" page when rates
 * change, or refresh their "About Us" page with new team information.
 *   
 * Use the `pageUpdate` mutation to:
 * - Update page content and titles
 * - Modify publication status
 * - Change page handles for URL structure
 * - Adjust template settings
 *   
 * The mutation supports partial updates, allowing specific changes while preserving other page properties.
 */
public class PageUpdateGraphQLQuery extends GraphQLQuery {
  public PageUpdateGraphQLQuery(String id, PageUpdateInput page, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (page != null || fieldsSet.contains("page")) {
        getInput().put("page", page);
    }
  }

  public PageUpdateGraphQLQuery(String id, PageUpdateInput page, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (page != null || fieldsSet.contains("page")) {
        getInput().put("page", page);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public PageUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "pageUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private PageUpdateInput page;

    private String queryName;

    public PageUpdateGraphQLQuery build() {
      return new PageUpdateGraphQLQuery(id, page, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the page to be updated.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the page to be updated.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The properties of the page to be updated.
     */
    public Builder page(PageUpdateInput page) {
      this.page = page;
      this.fieldsSet.add("page");
      return this;
    }

    /**
     * The properties of the page to be updated.
     */
    public Builder pageReference(String variableRef) {
      this.variableReferences.put("page", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("PageUpdateInput"))).build());
      this.fieldsSet.add("page");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
