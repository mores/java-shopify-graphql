package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ThemeRole;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Returns a paginated list of themes for the shop.
 */
public class ThemesGraphQLQuery extends GraphQLQuery {
  public ThemesGraphQLQuery(List<ThemeRole> roles, List<String> names, Integer first, String after,
      Integer last, String before, Boolean reverse, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (roles != null || fieldsSet.contains("roles")) {
        getInput().put("roles", roles);
    }if (names != null || fieldsSet.contains("names")) {
        getInput().put("names", names);
    }if (first != null || fieldsSet.contains("first")) {
        getInput().put("first", first);
    }if (after != null || fieldsSet.contains("after")) {
        getInput().put("after", after);
    }if (last != null || fieldsSet.contains("last")) {
        getInput().put("last", last);
    }if (before != null || fieldsSet.contains("before")) {
        getInput().put("before", before);
    }if (reverse != null || fieldsSet.contains("reverse")) {
        getInput().put("reverse", reverse);
    }
  }

  public ThemesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "themes";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<ThemeRole> roles;

    private List<String> names;

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private Boolean reverse;

    private String queryName;

    public ThemesGraphQLQuery build() {
      return new ThemesGraphQLQuery(roles, names, first, after, last, before, reverse, queryName, fieldsSet);
               
    }

    /**
     * The theme roles to filter by.
     */
    public Builder roles(List<ThemeRole> roles) {
      this.roles = roles;
      this.fieldsSet.add("roles");
      return this;
    }

    /**
     * The theme names to filter by. Use '*' to match zero or more characters.
     */
    public Builder names(List<String> names) {
      this.names = names;
      this.fieldsSet.add("names");
      return this;
    }

    /**
     * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder first(Integer first) {
      this.first = first;
      this.fieldsSet.add("first");
      return this;
    }

    /**
     * The elements that come after the specified [cursor](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder after(String after) {
      this.after = after;
      this.fieldsSet.add("after");
      return this;
    }

    /**
     * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder last(Integer last) {
      this.last = last;
      this.fieldsSet.add("last");
      return this;
    }

    /**
     * The elements that come before the specified [cursor](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder before(String before) {
      this.before = before;
      this.fieldsSet.add("before");
      return this;
    }

    /**
     * Reverse the order of the underlying list.
     */
    public Builder reverse(Boolean reverse) {
      this.reverse = reverse;
      this.fieldsSet.add("reverse");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
