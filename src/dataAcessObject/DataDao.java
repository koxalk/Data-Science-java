/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAcessObject;

import java.util.List;

/**
 *
 * @author kosta
 */
public interface DataDao {
    
    public String addData(DataModel d);
    public String removeData(int id);
    public String updateData(DataModel d,int id);
    public List<DataModel> getData();
}
