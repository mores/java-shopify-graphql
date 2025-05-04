package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.AppInstallationCategory;
import com.shopify.admin.types.AppInstallationPrivacy;
import com.shopify.admin.types.AppInstallationSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * A list of app installations. To use this query, you need to contact [Shopify
 * Support](https://partners.shopify.com/current/support/) to grant your custom
 * app the `read_apps` access scope. Public apps can't be granted this access scope.
 */
public class AppInstallationsGraphQLQuery extends GraphQLQuery {
  public AppInstallationsGraphQLQuery(Integer first, String after, Integer last, String before,
      Boolean reverse, AppInstallationSortKeys sortKey, AppInstallationCategory category,
      AppInstallationPrivacy privacy, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (first != null || fieldsSet.contains("first")) {
        getInput().put("first", first);
    }if (after != null || fieldsSet.contains("after")) {
        getInput().put("after", after);
    }if (last != null || fieldsSet.contains("last")) {
        getInput().put("last", last);
    }if (before != null || fieldsSet.contains("before")) {
        getInput().put("before", before);
    }if (reverse != null || fieldsSet.contains("reverse")) {
        getInput().put("reverse", reverse);
    }if (sortKey != null || fieldsSet.contains("sortKey")) {
        getInput().put("sortKey", sortKey);
    }if (category != null || fieldsSet.contains("category")) {
        getInput().put("category", category);
    }if (privacy != null || fieldsSet.contains("privacy")) {
        getInput().put("privacy", privacy);
    }
  }

  public AppInstallationsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "appInstallations";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private Boolean reverse;

    private AppInstallationSortKeys sortKey;

    private AppInstallationCategory category;

    private AppInstallationPrivacy privacy;

    private String queryName;

    public AppInstallationsGraphQLQuery build() {
      return new AppInstallationsGraphQLQuery(first, after, last, before, reverse, sortKey, category, privacy, queryName, fieldsSet);
               
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

    /**
     * Sort the underlying list using a key. If your query is slow or returns an
     * error, then [try specifying a sort key that matches the field used in the search](https://shopify.dev/api/usage/pagination-graphql#search-performance-considerations).
     */
    public Builder sortKey(AppInstallationSortKeys sortKey) {
      this.sortKey = sortKey;
      this.fieldsSet.add("sortKey");
      return this;
    }

    /**
     * The category of app installations to fetch.
     */
    public Builder category(AppInstallationCategory category) {
      this.category = category;
      this.fieldsSet.add("category");
      return this;
    }

    /**
     * The privacy level of app installations to fetch.
     */
    public Builder privacy(AppInstallationPrivacy privacy) {
      this.privacy = privacy;
      this.fieldsSet.add("privacy");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
