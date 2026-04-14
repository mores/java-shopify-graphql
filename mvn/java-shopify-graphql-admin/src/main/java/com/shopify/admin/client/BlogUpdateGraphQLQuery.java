package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.BlogUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
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

    private String id;

    private BlogUpdateInput blog;

    private String queryName;

    public BlogUpdateGraphQLQuery build() {
      return new BlogUpdateGraphQLQuery(id, blog, queryName, fieldsSet);
               
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
     * The properties of the blog to be updated.
     */
    public Builder blog(BlogUpdateInput blog) {
      this.blog = blog;
      this.fieldsSet.add("blog");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
