package io.github.mores;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/**
 * Represents a single directive to be applied to the top-level operation field.
 *
 * <p>Example — to produce {@code @idempotent(key: "abc-123")}:
 * <pre>{@code
 * new GraphQLDirective("idempotent", Map.of("key", "abc-123"))
 * }</pre>
 *
 * <p>Argument values are serialized as GraphQL {@code StringValue} by default.
 * For non-string scalars (Int, Boolean, EnumValue, etc.) pass a pre-built
 * {@code graphql.language.Value} instance and it will be used as-is.
 */
public final class GraphQLDirective {

    private final String name;
    private final Map<String, Object> arguments;

    /**
     * Directive with no arguments (e.g. {@code @deprecated}).
     */
    public GraphQLDirective(String name) {
        this(name, Collections.emptyMap());
    }

    /**
     * Directive with one or more arguments.
     *
     * @param name      the directive name (without the {@code @} prefix)
     * @param arguments map of argument name → value; plain {@link String} values are
     *                  serialized as GraphQL {@code StringValue}, pre-built
     *                  {@code graphql.language.Value} instances are used as-is
     */
    public GraphQLDirective(String name, Map<String, Object> arguments) {
        this.name = Objects.requireNonNull(name, "name must not be null");
        this.arguments = Collections.unmodifiableMap(
                Objects.requireNonNull(arguments, "arguments must not be null"));
    }

    public String getName() {
        return name;
    }

    public Map<String, Object> getArguments() {
        return arguments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GraphQLDirective)) return false;
        GraphQLDirective that = (GraphQLDirective) o;
        return Objects.equals(name, that.name) && Objects.equals(arguments, that.arguments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, arguments);
    }

    @Override
    public String toString() {
        return "GraphQLDirective{name='" + name + "', arguments=" + arguments + "}";
    }
}
