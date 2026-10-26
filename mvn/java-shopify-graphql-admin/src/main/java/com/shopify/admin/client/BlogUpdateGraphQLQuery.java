package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.BlogUpdateInput;
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
 * Updates an existing blog's configuration and settings. This mutation allows
 * merchants to modify blog properties to keep their content strategy current.
 *   
 * For example, a merchant might update their blog's title from "Company News" to
 * "Sustainability Stories" when shifting their content focus, or modify the
 * handle to improve URL structure.
 *   
 * Use the `blogUpdate` mutation to:
 * - Change blog titles for rebranding
 * - Modify blog handles for better URLs
 * - Adjust comment settings and moderation preferences
 *   
 * The mutation returns the updated blog with any validation errors.
 */
public class BlogUpdateGraphQLQuery extends GraphQLQuery {
  public BlogUpdateGraphQLQuery(String id, BlogUpdateInput blog, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (blog != null || fieldsSet.contains("blog")) {
        getInput().put("blog", blog);
    }
  }

  public BlogUpdateGraphQLQuery(String id, BlogUpdateInput blog, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (blog != null || fieldsSet.contains("blog")) {
        getInput().put("blog", blog);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public BlogUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "blogUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private BlogUpdateInput blog;

    private String queryName;

    public BlogUpdateGraphQLQuery build() {
      return new BlogUpdateGraphQLQuery(id, blog, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the blog to be updated.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the blog to be updated.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The properties of the blog to be updated.
     */
    public Builder blog(BlogUpdateInput blog) {
      this.blog = blog;
      this.fieldsSet.add("blog");
      return this;
    }

    /**
     * The properties of the blog to be updated.
     */
    public Builder blogReference(String variableRef) {
      this.variableReferences.put("blog", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("BlogUpdateInput"))).build());
      this.fieldsSet.add("blog");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
