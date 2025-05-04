package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.BlogCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a blog.
 */
public class BlogCreateGraphQLQuery extends GraphQLQuery {
  public BlogCreateGraphQLQuery(BlogCreateInput blog, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (blog != null || fieldsSet.contains("blog")) {
        getInput().put("blog", blog);
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

    private BlogCreateInput blog;

    private String queryName;

    public BlogCreateGraphQLQuery build() {
      return new BlogCreateGraphQLQuery(blog, queryName, fieldsSet);
               
    }

    /**
     * The properties of the new blog.
     */
    public Builder blog(BlogCreateInput blog) {
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
