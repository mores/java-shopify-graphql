package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.ProductSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a list of the shop's products. For storefront search, use the
 * [`search`](https://shopify.dev/docs/api/storefront/latest/queries/search) query.
 */
public class ProductsGraphQLQuery extends GraphQLQuery {
  public ProductsGraphQLQuery(String after, String before, Integer first, Integer last,
      String query, Boolean reverse, ProductSortKeys sortKey, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (after != null || fieldsSet.contains("after")) {
        getInput().put("after", after);
    }if (before != null || fieldsSet.contains("before")) {
        getInput().put("before", before);
    }if (first != null || fieldsSet.contains("first")) {
        getInput().put("first", first);
    }if (last != null || fieldsSet.contains("last")) {
        getInput().put("last", last);
    }if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }if (reverse != null || fieldsSet.contains("reverse")) {
        getInput().put("reverse", reverse);
    }if (sortKey != null || fieldsSet.contains("sortKey")) {
        getInput().put("sortKey", sortKey);
    }
  }

  public ProductsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "products";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String after;

    private String before;

    private Integer first;

    private Integer last;

    private String query;

    private Boolean reverse;

    private ProductSortKeys sortKey;

    private String queryName;

    public ProductsGraphQLQuery build() {
      return new ProductsGraphQLQuery(after, before, first, last, query, reverse, sortKey, queryName, fieldsSet);
               
    }

    /**
     * Returns the elements that come after the specified cursor.
     */
    public Builder after(String after) {
      this.after = after;
      this.fieldsSet.add("after");
      return this;
    }

    /**
     * Returns the elements that come before the specified cursor.
     */
    public Builder before(String before) {
      this.before = before;
      this.fieldsSet.add("before");
      return this;
    }

    /**
     * Returns up to the first `n` elements from the list.
     */
    public Builder first(Integer first) {
      this.first = first;
      this.fieldsSet.add("first");
      return this;
    }

    /**
     * Returns up to the last `n` elements from the list.
     */
    public Builder last(Integer last) {
      this.last = last;
      this.fieldsSet.add("last");
      return this;
    }

    /**
     * You can apply one or multiple filters to a query.
     * | name | description | acceptable_values | default_value | example_use |
     * | ---- | ---- | ---- | ---- | ---- |
     * | available_for_sale | Filter by products that have at least one product variant available for sale. |
     * | created_at | Filter by the date and time when the product was created. | |
     * | - `created_at:>'2020-10-21T23:39:20Z'`<br/> - `created_at:&lt;now`<br/> -
     * `created_at:&lt;=2024` |
     * | product_type | Filter by a comma-separated list of [product
     * types](https://help.shopify.com/en/manual/products/details/product-type). |
     * | | `product_type:snowboard` |
     * | tag | Filter products by the product [`tags`](https://shopify.dev/docs/api/storefront/latest/objects/Product#field-tags)
     * field. | | | `tag:my_tag` |
     * | tag_not | Filter by products that don't have the specified product [tags](https://shopify.dev/docs/api/storefront/latest/objects/Product#field-tags).
     * | | | `tag_not:my_tag` |
     * | title | Filter by the product [`title`](https://shopify.dev/docs/api/storefront/latest/objects/Product#field-title)
     * field. | | | `title:The Minimal Snowboard` |
     * | updated_at | Filter by the date and time when the product was last
     * updated. | | | - `updated_at:>'2020-10-21T23:39:20Z'`<br/> -
     * `updated_at:&lt;now`<br/> - `updated_at:&lt;=2024` |
     * | variants.price | Filter by the price of the product's variants. |
     * | vendor | Filter by the product [`vendor`](https://shopify.dev/docs/api/storefront/latest/objects/Product#field-vendor)
     * field. | | | - `vendor:Snowdevil`<br/> - `vendor:Snowdevil OR
     * vendor:Icedevil` |
     * Learn more about [Shopify API search syntax](https://shopify.dev/api/usage/search-syntax).
     */
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
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
     * Sort the underlying list by the given key.
     */
    public Builder sortKey(ProductSortKeys sortKey) {
      this.sortKey = sortKey;
      this.fieldsSet.add("sortKey");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
