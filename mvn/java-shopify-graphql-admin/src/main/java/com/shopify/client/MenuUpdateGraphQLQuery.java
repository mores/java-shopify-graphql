package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MenuItemUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Updates a menu.
 */
public class MenuUpdateGraphQLQuery extends GraphQLQuery {
  public MenuUpdateGraphQLQuery(String id, String title, String handle,
      List<MenuItemUpdateInput> items, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (title != null || fieldsSet.contains("title")) {
        getInput().put("title", title);
    }if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }if (items != null || fieldsSet.contains("items")) {
        getInput().put("items", items);
    }
  }

  public MenuUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "menuUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String title;

    private String handle;

    private List<MenuItemUpdateInput> items;

    private String queryName;

    public MenuUpdateGraphQLQuery build() {
      return new MenuUpdateGraphQLQuery(id, title, handle, items, queryName, fieldsSet);
               
    }

    /**
     * ID of the menu to be updated.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
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
    public Builder items(List<MenuItemUpdateInput> items) {
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
