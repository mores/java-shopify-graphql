package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Retrieves an [`AppInstallation`](https://shopify.dev/docs/api/admin-graphql/latest/objects/AppInstallation) by ID. If no ID is provided, returns the installation for the currently authenticated
 * [`App`](https://shopify.dev/docs/api/admin-graphql/latest/objects/App). The
 * query provides essential data for validating installation state and managing
 * app functionality within a store.
 *   
 * Use this query to access installation details including granted [`AccessScope`](https://shopify.dev/docs/api/admin-graphql/latest/objects/AccessScope)
 * objects, active [`AppSubscription`](https://shopify.dev/docs/api/admin-graphql/latest/objects/AppSubscription) objects, [`AppCredit`](https://shopify.dev/docs/api/admin-graphql/latest/objects/AppCredit) objects, [`AppPurchaseOneTime`](https://shopify.dev/docs/api/admin-graphql/latest/objects/AppPurchaseOneTime)
 * objects, and app-specific metadata.
 *   
 * Learn more about [app installation](https://shopify.dev/docs/apps/build/authentication-authorization/app-installation).
 */
public class AppInstallationGraphQLQuery extends GraphQLQuery {
  public AppInstallationGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public AppInstallationGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "appInstallation";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public AppInstallationGraphQLQuery build() {
      return new AppInstallationGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * ID used to lookup AppInstallation.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
