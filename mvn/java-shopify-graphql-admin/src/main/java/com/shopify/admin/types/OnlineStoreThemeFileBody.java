package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = OnlineStoreThemeFileBodyBase64.class, name = "OnlineStoreThemeFileBodyBase64"),
    @JsonSubTypes.Type(value = OnlineStoreThemeFileBodyText.class, name = "OnlineStoreThemeFileBodyText"),
    @JsonSubTypes.Type(value = OnlineStoreThemeFileBodyUrl.class, name = "OnlineStoreThemeFileBodyUrl")
})
public interface OnlineStoreThemeFileBody {
}
