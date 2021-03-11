/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataoperations.dictionary;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kosta
 */
public class TermDictionary implements Dictionary {

    private final Map<String, Integer> indexedTerms;
    private int counter;

    public TermDictionary() {
        this.indexedTerms = new HashMap<>();
        counter = 0;
    }

    public void addTerm(String term) {
        if (!indexedTerms.containsKey(term)) {
            indexedTerms.put(term, counter++);
        }
    }

    public void addTerms(String[] terms) {
        for (String term : terms) {
            addTerm(term);
        }
    }

    @Override
    public Integer getTermIndex(String term) {
        return this.indexedTerms.get(term);
    }

    @Override
    public int getNumTerms() {
        return this.indexedTerms.size();
    }

}
