package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.PredictiveSearchLimitScope;
import com.shopify.storefront.types.PredictiveSearchType;
import com.shopify.storefront.types.SearchUnavailableProductsType;
import graphql.language.VariableDefinition;
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
 * Returns suggested results as customers type in a search field, enabling
 * type-ahead search experiences. The query matches
 * [products](https://shopify.dev/docs/api/storefront/current/objects/Product), [collections](https://shopify.dev/docs/api/storefront/current/objects/Collection),
 * [pages](https://shopify.dev/docs/api/storefront/current/objects/Page), and
 * [articles](https://shopify.dev/docs/api/storefront/current/objects/Article)
 * based on partial search terms, and also provides [search query suggestions](https://shopify.dev/docs/api/storefront/current/objects/SearchQuerySuggestion)
 * to help customers refine their search.
 *   
 * You can filter results by resource type and limit the quantity. The [`limitScope`](https://shopify.dev/docs/api/storefront/current/queries/predictiveSearch#arguments-limitScope)
 * argument controls whether limits apply across all result types or per type. Use [`unavailableProducts`](https://shopify.dev/docs/api/storefront/current/queries/predictiveSearch#arguments-unavailableProducts)
 * to control how out-of-stock products appear in results.
 */
public class PredictiveSearchGraphQLQuery extends GraphQLQuery {
  public PredictiveSearchGraphQLQuery(Integer limit, PredictiveSearchLimitScope limitScope,
      String query, List<PredictiveSearchType> types,
      SearchUnavailableProductsType unavailableProducts, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (limit != null || fieldsSet.contains("limit")) {
        getInput().put("limit", limit);
    }if (limitScope != null || fieldsSet.contains("limitScope")) {
        getInput().put("limitScope", limitScope);
    }if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }if (types != null || fieldsSet.contains("types")) {
        getInput().put("types", types);
    }if (unavailableProducts != null || fieldsSet.contains("unavailableProducts")) {
        getInput().put("unavailableProducts", unavailableProducts);
    }
  }

  public PredictiveSearchGraphQLQuery(Integer limit, PredictiveSearchLimitScope limitScope,
      String query, List<PredictiveSearchType> types,
      SearchUnavailableProductsType unavailableProducts, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (limit != null || fieldsSet.contains("limit")) {
        getInput().put("limit", limit);
    }if (limitScope != null || fieldsSet.contains("limitScope")) {
        getInput().put("limitScope", limitScope);
    }if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
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

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private Integer limit;

    private PredictiveSearchLimitScope limitScope;

    private String query;

    private List<PredictiveSearchType> types;

    private SearchUnavailableProductsType unavailableProducts;

    private String queryName;

    public PredictiveSearchGraphQLQuery build() {
      return new PredictiveSearchGraphQLQuery(limit, limitScope, query, types, unavailableProducts, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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
     * Limits the number of results based on `limit_scope`. The value can range from 1 to 10, and the default is 10.
     */
    public Builder limitReference(String variableRef) {
      this.variableReferences.put("limit", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Int")).build());
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
     * Decides the distribution of results.
     */
    public Builder limitScopeReference(String variableRef) {
      this.variableReferences.put("limitScope", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("PredictiveSearchLimitScope")).build());
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
     * The search query.
     */
    public Builder queryReference(String variableRef) {
      this.variableReferences.put("query", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("query");
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
     * The types of resources to search for.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder typesReference(String variableRef) {
      this.variableReferences.put("types", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("PredictiveSearchType")))).build());
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

    /**
     * Specifies how unavailable products are displayed in the search results.
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
