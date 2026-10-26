package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.BlogCreateInput;
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
 * Creates a new blog within a shop, establishing a container for organizing articles.
 *   
 * For example, a fitness equipment retailer launching a wellness blog would use
 * this mutation to create the blog, enabling them to publish workout guides and
 * nutrition tips.
 *   
 * Use the `blogCreate` mutation to:
 * - Launch new content marketing initiatives
 * - Create separate blogs for different content themes
 * - Establish spaces for article organization
 *   
 * The mutation validates blog settings and establishes the structure for article publishing.
 */
public class BlogCreateGraphQLQuery extends GraphQLQuery {
  public BlogCreateGraphQLQuery(BlogCreateInput blog, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (blog != null || fieldsSet.contains("blog")) {
        getInput().put("blog", blog);
    }
  }

  public BlogCreateGraphQLQuery(BlogCreateInput blog, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (blog != null || fieldsSet.contains("blog")) {
        getInput().put("blog", blog);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public BlogCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "blogCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private BlogCreateInput blog;

    private String queryName;

    public BlogCreateGraphQLQuery build() {
      return new BlogCreateGraphQLQuery(blog, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The properties of the new blog.
     */
    public Builder blog(BlogCreateInput blog) {
      this.blog = blog;
      this.fieldsSet.add("blog");
      return this;
    }

    /**
     * The properties of the new blog.
     */
    public Builder blogReference(String variableRef) {
      this.variableReferences.put("blog", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("BlogCreateInput"))).build());
      this.fieldsSet.add("blog");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
