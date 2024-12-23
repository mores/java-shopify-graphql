package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * <div class="note"><h4>Theme app extensions</h4>
 *   <p>Your app might not pass App Store review if it uses script tags instead of
 * theme app extensions. All new apps, and apps that integrate with Online Store
 * 2.0 themes, should use theme app extensions, such as app blocks or app embed
 * blocks. Script tags are an alternative you can use with only vintage themes.
 * <a href="/apps/online-store#what-integration-method-should-i-use"
 * target="_blank">Learn more</a>.</p></div>
 *   
 * <div class="note"><h4>Script tag deprecation</h4>
 *   <p>Script tags will be sunset for the <b>Order status</b> page on August 28, 2025. <a href="https://www.shopify.com/plus/upgrading-to-checkout-extensibility">Upgrade
 * to Checkout Extensibility</a> before this date. <a
 * href="/docs/api/liquid/objects#script">Shopify Scripts</a> will continue to
 * work alongside Checkout Extensibility until August 28, 2025.</p></div>
 *   
 *   
 * A list of script tags.
 */
public class ScriptTagsGraphQLQuery extends GraphQLQuery {
  public ScriptTagsGraphQLQuery(Integer first, String after, Integer last, String before,
      Boolean reverse, String query, String src, String queryName, Set<String> fieldsSet) {
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
    }if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }if (src != null || fieldsSet.contains("src")) {
        getInput().put("src", src);
    }
  }

  public ScriptTagsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "scriptTags";
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

    private String query;

    private String src;

    private String queryName;

    public ScriptTagsGraphQLQuery build() {
      return new ScriptTagsGraphQLQuery(first, after, last, before, reverse, query, src, queryName, fieldsSet);
               
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
     * A filter made up of terms, connectives, modifiers, and comparators.
     * | name | type | description | acceptable_values | default_value | example_use |
     * | ---- | ---- | ---- | ---- | ---- | ---- |
     * | created_at | time |
     * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
     * | src | string |
     * | updated_at | time |
     * You can apply one or more filters to a query. Learn more about [Shopify API
     * search syntax](https://shopify.dev/api/usage/search-syntax).
     */
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
      return this;
    }

    /**
     * The source URL of the script tag to filter by.
     */
    public Builder src(String src) {
      this.src = src;
      this.fieldsSet.add("src");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
