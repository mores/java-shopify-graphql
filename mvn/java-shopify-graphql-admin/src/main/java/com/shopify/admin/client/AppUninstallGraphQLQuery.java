package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Uninstalls an [`App`](https://shopify.dev/docs/api/admin-graphql/latest/objects/App) from
 * a shop. Apps use this mutation to uninstall themselves programmatically, removing their [`AppInstallation`](https://shopify.dev/docs/api/admin-graphql/latest/objects/AppInstallation)
 * from the merchant's store.
 *   
 * When an app uninstalls, Shopify automatically performs cleanup tasks, such as deleting [`WebhookSubscription`](https://shopify.dev/docs/api/admin-graphql/latest/objects/WebhookSubscription)
 * objects and [admin
 * links](https://shopify.dev/docs/apps/build/admin/admin-links) associated with the app.
 *   
 * Learn more about [app lifecycle management](https://shopify.dev/docs/apps/build/authentication-authorization/app-installation/uninstall-app-api-request).
 *   
 * > Caution:
 * > This action is irreversible. You can't restore an uninstalled app's
 * configuration or data. Before you uninstall an app, make sure that you no
 * longer need to make API calls for the store in which the app has been installed.
 */
public class AppUninstallGraphQLQuery extends GraphQLQuery {
  public AppUninstallGraphQLQuery(String queryName) {
    super("mutation", queryName);
  }

  public AppUninstallGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "appUninstall";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public AppUninstallGraphQLQuery build() {
      return new AppUninstallGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
