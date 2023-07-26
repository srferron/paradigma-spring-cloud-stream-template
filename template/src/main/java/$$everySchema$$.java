{% include 'partials/java-package' -%}
{% set extraIncludes = [schemaName, schema] | schemaExtraIncludes %}
import com.fasterxml.jackson.annotation.JsonInclude;
{% if extraIncludes.needJsonPropertyInclude -%}
import com.fasterxml.jackson.annotation.JsonProperty;
{% endif %}
{% from "partials/java-class" import javaClass -%}
import lombok.Builder;
import lombok.Value;

@Value
@Builder
{{ javaClass(schemaName, schema, schema.properties(), 0, false) }}
