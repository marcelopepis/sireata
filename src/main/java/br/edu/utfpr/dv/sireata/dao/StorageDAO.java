
package br.edu.utfpr.dv.sireata.dao;

import java.sql.SQLException;

public interface StorageDAO<T> {
  T buscarPorId(int id) throws SQLException;
  int salvar(T t) throws SQLException;
}