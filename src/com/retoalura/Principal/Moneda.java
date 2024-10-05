package com.retoalura.Principal;

public record Moneda(
        String result,
        String time_last_update_utc,
        String base_code,
        String target_code,
        String target_data,
        double conversion_rate,
        double conversion_result
) {
}
