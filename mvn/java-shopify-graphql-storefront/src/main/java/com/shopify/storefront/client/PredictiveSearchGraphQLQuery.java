package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.PredictiveSearchLimitScope;
import com.shopify.storefront.types.PredictiveSearchType;
import com.shopify.storefront.types.SearchUnavailableProductsType;
import com.shopify.storefront.types.SearchableField;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * List of the predictive search results.
 */
public class PredictiveSearchGraphQLQuery extends GraphQLQuery {
  public PredictiveSearchGraphQLQuery(Integer limit, PredictiveSearchLimitScope limitScope,
      String query, List<SearchableField> searchableFields, List<PredictiveSearchType> types,
      SearchUnavailableProductsType unavailableProducts, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (limit != null || fieldsSet.contains("limit")) {
        getInput().put("limit", limit);
    }if (limitScope != null || fieldsSet.contains("limitScope")) {
        getInput().put("limitScope", limitScope);
    }if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }if (searchableFields != null || fieldsSet.contains("searchableFields")) {
        getInput().put("searchableFields", searchableFields);
    }if (types != null || fieldsSet.contains("types")) {
        getInput().put("types", types);
    }if (unavailableProducts != null || fieldsSet.contains("unavailableProducts")) {
        getInput().put("unavailableProducts", unavailableProducts);
    }
  }

  public PredictiveSearchGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "predictiveSearch";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private Integer limit;

    private PredictiveSearchLimitScope limitScope;

    private String query;

    private List<SearchableField> searchableFields;

    private List<PredictiveSearchType> types;

    private SearchUnavailableProductsType unavailableProducts;

    private String queryName;

    public PredictiveSearchGraphQLQuery build() {
      return new PredictiveSearchGraphQLQuery(limit, limitScope, query, searchableFields, types, unavailableProducts, queryName, fieldsSet);
               
    }

    /**
     * Limits the number of results based on `limit_scope`. The value can range from 1 to 10, and the default is 10.
     */
    public Builder limit(Integer limit) {
      this.limit = limit;
      this.fieldsSet.add("limit");
      return this;
    }

    /**
     * Decides the distribution of results.
     */
    public Builder limitScope(PredictiveSearchLimitScope limitScope) {
      this.limitScope = limitScope;
      this.fieldsSet.add("limitScope");
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
     * Specifies the list of resource fields to use for search. The default fields
     * searched on are TITLE, PRODUCT_TYPE, VARIANT_TITLE, and VENDOR. For the best
     * search experience, you should search on the default field set.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder searchableFields(List<SearchableField> searchableFields) {
      this.searchableFields = searchableFields;
      this.fieldsSet.add("searchableFields");
      return this;
    }

    /**
     * The types of resources to search for.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder types(List<PredictiveSearchType> types) {
      this.types = types;
      this.fieldsSet.add("types");
      return this;
    }

    /**
     * Specifies how unavailable products are displayed in the search results.
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
