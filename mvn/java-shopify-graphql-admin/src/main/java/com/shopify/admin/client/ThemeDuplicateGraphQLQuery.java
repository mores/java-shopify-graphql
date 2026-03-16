package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Duplicates a theme.
 */
public class ThemeDuplicateGraphQLQuery extends GraphQLQuery {
  public ThemeDuplicateGraphQLQuery(String id, String name, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (name != null || fieldsSet.contains("name")) {
        getInput().put("name", name);
    }
  }

  public ThemeDuplicateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "themeDuplicate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String name;

    private String queryName;

    public ThemeDuplicateGraphQLQuery build() {
      return new ThemeDuplicateGraphQLQuery(id, name, queryName, fieldsSet);
               
    }

    /**
     * ID of the theme to be duplicated.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * Name of the new theme.
     */
    public Builder name(String name) {
      this.name = name;
      this.fieldsSet.add("name");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
