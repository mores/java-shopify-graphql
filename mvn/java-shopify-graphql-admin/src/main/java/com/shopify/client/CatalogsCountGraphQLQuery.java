package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CatalogType;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


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

    
    public Builder type(CatalogType type) {
      this.type = type;
      this.fieldsSet.add("type");
      return this;
    }

    
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
