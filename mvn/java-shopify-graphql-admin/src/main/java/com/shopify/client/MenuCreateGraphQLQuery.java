package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MenuItemCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Creates a menu.
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
     * The menus's handle.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      this.fieldsSet.add("handle");
      return this;
    }

    /**
     * List of the menus' items.
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
