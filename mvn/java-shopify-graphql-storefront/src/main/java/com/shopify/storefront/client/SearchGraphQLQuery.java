package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.ProductFilter;
import com.shopify.storefront.types.SearchPrefixQueryType;
import com.shopify.storefront.types.SearchSortKeys;
import com.shopify.storefront.types.SearchType;
import com.shopify.storefront.types.SearchUnavailableProductsType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * List of the search results.
 */
public class SearchGraphQLQuery extends GraphQLQuery {
  public SearchGraphQLQuery(String after, String before, Integer first, Integer last,
      SearchPrefixQueryType prefix, List<ProductFilter> productFilters, String query,
      Boolean reverse, SearchSortKeys sortKey, List<SearchType> types,
      SearchUnavailableProductsType unavailableProducts, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (after != null || fieldsSet.contains("after")) {
        getInput().put("after", after);
    }if (before != null || fieldsSet.contains("before")) {
        getInput().put("before", before);
    }if (first != null || fieldsSet.contains("first")) {
        getInput().put("first", first);
    }if (last != null || fieldsSet.contains("last")) {
        getInput().put("last", last);
    }if (prefix != null || fieldsSet.contains("prefix")) {
        getInput().put("prefix", prefix);
    }if (productFilters != null || fieldsSet.contains("productFilters")) {
        getInput().put("productFilters", productFilters);
    }if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }if (reverse != null || fieldsSet.contains("reverse")) {
        getInput().put("reverse", reverse);
    }if (sortKey != null || fieldsSet.contains("sortKey")) {
        getInput().put("sortKey", sortKey);
    }if (types != null || fieldsSet.contains("types")) {
        getInput().put("types", types);
    }if (unavailableProducts != null || fieldsSet.contains("unavailableProducts")) {
        getInput().put("unavailableProducts", unavailableProducts);
    }
  }

  public SearchGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "search";
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

    private SearchPrefixQueryType prefix;

    private List<ProductFilter> productFilters;

    private String query;

    private Boolean reverse;

    private SearchSortKeys sortKey;

    private List<SearchType> types;

    private SearchUnavailableProductsType unavailableProducts;

    private String queryName;

    public SearchGraphQLQuery build() {
      return new SearchGraphQLQuery(after, before, first, last, prefix, productFilters, query, reverse, sortKey, types, unavailableProducts, queryName, fieldsSet);
               
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
     * Specifies whether to perform a partial word match on the last search term.
     */
    public Builder prefix(SearchPrefixQueryType prefix) {
      this.prefix = prefix;
      this.fieldsSet.add("prefix");
      return this;
    }

    /**
     * Returns a subset of products matching all product filters.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder productFilters(List<ProductFilter> productFilters) {
      this.productFilters = productFilters;
      this.fieldsSet.add("productFilters");
      return this;
    }

    /**
     * The search query.
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
    public Builder sortKey(SearchSortKeys sortKey) {
      this.sortKey = sortKey;
      this.fieldsSet.add("sortKey");
      return this;
    }

    /**
     * The types of resources to search for.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder types(List<SearchType> types) {
      this.types = types;
      this.fieldsSet.add("types");
      return this;
    }

    /**
     * Specifies how unavailable products or variants are displayed in the search results.
     */
    public Builder unavailableProducts(SearchUnavailableProductsType unavailableProducts) {
      this.unavailableProducts = unavailableProducts;
      this.fieldsSet.add("unavailableProducts");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
