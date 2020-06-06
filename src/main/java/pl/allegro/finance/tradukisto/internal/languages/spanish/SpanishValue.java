package pl.allegro.finance.tradukisto.internal.languages.spanish;

import com.google.common.collect.ImmutableMap;
import pl.allegro.finance.tradukisto.internal.BaseValues;
import pl.allegro.finance.tradukisto.internal.languages.GenderForms;
import pl.allegro.finance.tradukisto.internal.languages.GenderType;
import pl.allegro.finance.tradukisto.internal.languages.PluralForms;
import pl.allegro.finance.tradukisto.internal.languages.RegularPluralForms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class SpanishValue {

    @Override
    public Map<Integer, GenderForms> baseNumbers() {
        return baseNumbersBuilder()
                .put(0, "CERO")
                .put(1, "UNO")
                .put(2, "DOS")
                .put(3, "TRES")
                .put(4, "CUATRO")
                .put(5, "CINCO")
                .put(6, "SEIS")
                .put(7, "SIETE")
                .put(8, "OCHO")
                .put(9, "NUEVE")
                .put(10, "DIEZ")
                .put(11, "ONCE")
                .put(12, "DOCE")
                .put(13, "TRECE")
                .put(14, "CATORCE")
                .put(15, "QUINCE")
                .put(16, "DIECISÉIS")
                .put(17, "DIECISIETE")
                .put(18, "DIECIOCHO")
                .put(19, "DIECINUEVE")
                .put(20, "VEINTE")
                .put(30, "TREINTA")
                .put(40, "CUATENTA")
                .put(50, "CINCUENTE")
                .put(60, "SECENTA")
                .put(70, "SETENTA")
                .put(80, "OCHENTA")
                .put(90, "NOVENTA")
                .put(100, "CIEN")
                .put(200, "DOCIENTOS")
                .put(300, "TRESIENTOS")
                .put(400, "CUATROCIENTOS")
                .put(500, "QUINIENTOS")
                .put(600, "SEICIENTOS")
                .put(700, "SETECIENTOS")
                .put(800, "OCHOCIENTOS")
                .put(900, "NOVECIENTOS")
                .put(1000, "MIL")
                .build();
    }

    @Override
    public List<PluralForms> pluralForms() {
        return Arrays.asList(
                new RegularPluralForms("", "", GenderType.MASCULINE),
                new RegularPluralForms("MIL", "MILES" , GenderType.MASCULINE),
                new RegularPluralForms("MILLON", "MILLONES", GenderType.MASCULINE),
                new RegularPluralForms("MILLAR", "MILLARES", GenderType.MASCULINE)
        );
    }

    @Override
    public String currency() {
        return "$";
    }

    @Override
    public char twoDigitsNumberSeparator() {
        return '-';
    }

    public Map<Integer, String> exceptions() {
        return ImmutableMap.<Integer, String>builder().put(1000, "MIL").build();
    }    
}