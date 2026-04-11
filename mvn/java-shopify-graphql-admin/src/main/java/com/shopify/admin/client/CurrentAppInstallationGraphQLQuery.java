package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns the [`AppInstallation`](https://shopify.dev/docs/api/admin-graphql/latest/objects/AppInstallation) for the currently authenticated app. Provides access to granted access scopes, active [`AppSubscription`](https://shopify.dev/docs/api/admin-graphql/latest/objects/AppSubscription)
 * objects, and billing information for your app.
 *   
 * Use this query to check which permissions your app has, monitor subscription
 * status, or retrieve [`AppCredit`](https://shopify.dev/docs/api/admin-graphql/latest/objects/AppCredit)
 * objects. Learn more about [managing access scopes](https://shopify.dev/docs/api/usage/access-scopes#checking-granted-access-scopes), [subscription
 * billing](https://shopify.dev/docs/apps/launch/billing/subscription-billing), and
 * [app credits](https://shopify.dev/docs/apps/launch/billing/award-app-credits).
 */
public class CurrentAppInstallationGraphQLQuery extends GraphQLQuery {
  public CurrentAppInstallationGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public CurrentAppInstallationGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "currentAppInstallation";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public CurrentAppInstallationGraphQLQuery build() {
      return new CurrentAppInstallationGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
