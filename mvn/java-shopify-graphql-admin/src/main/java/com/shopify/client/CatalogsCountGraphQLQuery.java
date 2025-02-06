package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CatalogType;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * The count of catalogs belonging to the shop. Limited to a maximum of 10000.
 */
public class CatalogsCountGraphQLQuery extends GraphQLQuery {
  public CatalogsCountGraphQLQuery(CatalogType type, String query, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (type != null || fieldsSet.contains("type")) {
        getInput().put("type", type);
    }if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }
  }

  public CatalogsCountGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "catalogsCount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private CatalogType type;

    private String query;

    private String queryName;

    public CatalogsCountGraphQLQuery build() {
      return new CatalogsCountGraphQLQuery(type, query, queryName, fieldsSet);
               
    }

    /**
     * The type of the catalogs to be returned.
     */
    public Builder type(CatalogType type) {
      this.type = type;
      this.fieldsSet.add("type");
      return this;
    }

    /**
     * A filter made up of terms, connectives, modifiers, and comparators.
     * | name | type | description | acceptable_values | default_value | example_use |
     * | ---- | ---- | ---- | ---- | ---- | ---- |
     * | default | string | Filter by a case-insensitive search of multiple fields
     * in a document. | | | - `query=Bob Norman`<br/> - `query=title:green hoodie` |
     * | app_id | id |
     * | company_id | id |
     * | company_location_id | id |
     * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:&lt;=1234` |
     * | managed_country_id | id |
     * | market_id | id |
     * | status | string |
     * | title | string |
     * You can apply one or more filters to a query. Learn more about [Shopify API
     * search syntax](https://shopify.dev/api/usage/search-syntax).
     */
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
