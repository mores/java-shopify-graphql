package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.ProductFilter;
import com.shopify.storefront.types.SearchPrefixQueryType;
import com.shopify.storefront.types.SearchSortKeys;
import com.shopify.storefront.types.SearchType;
import com.shopify.storefront.types.SearchUnavailableProductsType;
import graphql.language.VariableDefinition;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Returns paginated search results for
 * [`Product`](https://shopify.dev/docs/api/storefront/current/objects/Product),
 * [`Page`](https://shopify.dev/docs/api/storefront/current/objects/Page), and
 * [`Article`](https://shopify.dev/docs/api/storefront/current/objects/Article)
 * resources based on a query string. Results are sorted by relevance by default.
 *   
 * The response includes the total result count and available product filters for
 * building [faceted search interfaces](https://shopify.dev/docs/storefronts/headless/building-with-the-storefront-api/products-collections/filter-products).
 * A search returns up to 1,000 results. When product results are included, a
 * search returns up to 2 pages or articles, on the first page of results only.
 * To get more pages and articles, run a separate search with `types: [PAGE,
 * ARTICLE]`. Product results match partial words automatically. For page and
 * article results, use the [`prefix`](https://shopify.dev/docs/api/storefront/current/enums/SearchPrefixQueryType)
 * argument to match partial words on the last search term, so that a query like
 * "winter snow" can match pages that contain "snowboard" or "snowshoe".
 */
public class SearchGraphQLQuery extends GraphQLQuery {
  public SearchGraphQLQuery(Integer first, String after, Integer last, String before,
      Boolean reverse, SearchSortKeys sortKey, String query, SearchPrefixQueryType prefix,
      List<ProductFilter> productFilters, List<SearchType> types,
      SearchUnavailableProductsType unavailableProducts, String queryName, Set<String> fieldsSet) {
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
    }if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }if (prefix != null || fieldsSet.contains("prefix")) {
        getInput().put("prefix", prefix);
    }if (productFilters != null || fieldsSet.contains("productFilters")) {
        getInput().put("productFilters", productFilters);
    }if (types != null || fieldsSet.contains("types")) {
        getInput().put("types", types);
    }if (unavailableProducts != null || fieldsSet.contains("unavailableProducts")) {
        getInput().put("unavailableProducts", unavailableProducts);
    }
  }

  public SearchGraphQLQuery(Integer first, String after, Integer last, String before,
      Boolean reverse, SearchSortKeys sortKey, String query, SearchPrefixQueryType prefix,
      List<ProductFilter> productFilters, List<SearchType> types,
      SearchUnavailableProductsType unavailableProducts, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
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
    }if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }if (prefix != null || fieldsSet.contains("prefix")) {
        getInput().put("prefix", prefix);
    }if (productFilters != null || fieldsSet.contains("productFilters")) {
        getInput().put("productFilters", productFilters);
    }if (types != null || fieldsSet.contains("types")) {
        getInput().put("types", types);
    }if (unavailableProducts != null || fieldsSet.contains("unavailableProducts")) {
        getInput().put("unavailableProducts", unavailableProducts);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
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

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private Boolean reverse;

    private SearchSortKeys sortKey;

    private String query;

    private SearchPrefixQueryType prefix;

    private List<ProductFilter> productFilters;

    private List<SearchType> types;

    private SearchUnavailableProductsType unavailableProducts;

    private String queryName;

    public SearchGraphQLQuery build() {
      return new SearchGraphQLQuery(first, after, last, before, reverse, sortKey, query, prefix, productFilters, types, unavailableProducts, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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
     * Returns up to the first `n` elements from the list.
     */
    public Builder firstReference(String variableRef) {
      this.variableReferences.put("first", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Int")).build());
      this.fieldsSet.add("first");
      return this;
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
     * Returns the elements that come after the specified cursor.
     */
    public Builder afterReference(String variableRef) {
      this.variableReferences.put("after", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("after");
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
     * Returns up to the last `n` elements from the list.
     */
    public Builder lastReference(String variableRef) {
      this.variableReferences.put("last", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Int")).build());
      this.fieldsSet.add("last");
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
     * Returns the elements that come before the specified cursor.
     */
    public Builder beforeReference(String variableRef) {
      this.variableReferences.put("before", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
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
     * Reverse the order of the underlying list.
     */
    public Builder reverseReference(String variableRef) {
      this.variableReferences.put("reverse", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Boolean")).build());
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
     * Sort the underlying list by the given key.
     */
    public Builder sortKeyReference(String variableRef) {
      this.variableReferences.put("sortKey", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("SearchSortKeys")).build());
      this.fieldsSet.add("sortKey");
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
     * The search query.
     */
    public Builder queryReference(String variableRef) {
      this.variableReferences.put("query", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("query");
      return this;
    }

    /**
     * For page and article results, specifies whether to match partial words on
     * the last search term. Product results match partial words automatically.
     */
    public Builder prefix(SearchPrefixQueryType prefix) {
      this.prefix = prefix;
      this.fieldsSet.add("prefix");
      return this;
    }

    /**
     * For page and article results, specifies whether to match partial words on
     * the last search term. Product results match partial words automatically.
     */
    public Builder prefixReference(String variableRef) {
      this.variableReferences.put("prefix", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("SearchPrefixQueryType")).build());
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
     * Returns a subset of products matching all product filters.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder productFiltersReference(String variableRef) {
      this.variableReferences.put("productFilters", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ProductFilter")))).build());
      this.fieldsSet.add("productFilters");
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
     * The types of resources to search for.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder typesReference(String variableRef) {
      this.variableReferences.put("types", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("SearchType")))).build());
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

    /**
     * Specifies how unavailable products or variants are displayed in the search results.
     */
    public Builder unavailableProductsReference(String variableRef) {
      this.variableReferences.put("unavailableProducts", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("SearchUnavailableProductsType")).build());
      this.fieldsSet.add("unavailableProducts");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
