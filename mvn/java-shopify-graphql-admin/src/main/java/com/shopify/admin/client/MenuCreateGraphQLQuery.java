package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MenuItemCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Creates a navigation
 * [`Menu`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Menu) for
 * the online store. Menus organize links that help customers navigate to [collections](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection),
 * [products](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product),
 * [pages](https://shopify.dev/docs/api/admin-graphql/latest/objects/Page),
 * [blogs](https://shopify.dev/docs/api/admin-graphql/latest/objects/Blog), and custom URLs.
 *   
 * Each menu requires a unique handle for identification and can contain multiple [`MenuItem`](https://shopify.dev/docs/api/admin-graphql/latest/objects/MenuItem)
 * objects with nested sub-items up to three levels deep.
 */
public class MenuCreateGraphQLQuery extends GraphQLQuery {
  public MenuCreateGraphQLQuery(String title, String handle, List<MenuItemCreateInput> items,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (title != null || fieldsSet.contains("title")) {
        getInput().put("title", title);
    }if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }if (items != null || fieldsSet.contains("items")) {
        getInput().put("items", items);
    }
  }

  public MenuCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "menuCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String title;

    private String handle;

    private List<MenuItemCreateInput> items;

    private String queryName;

    public MenuCreateGraphQLQuery build() {
      return new MenuCreateGraphQLQuery(title, handle, items, queryName, fieldsSet);
               
    }

    /**
     * The menu's title.
     */
    public Builder title(String title) {
      this.title = title;
      this.fieldsSet.add("title");
      return this;
    }

    /**
     * The menu's handle.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      this.fieldsSet.add("handle");
      return this;
    }

    /**
     * List of the menu's items.
     */
    public Builder items(List<MenuItemCreateInput> items) {
      this.items = items;
      this.fieldsSet.add("items");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
