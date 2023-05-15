package com.ensakh.sitegestion.service;
import com.ensakh.sitegestion.entity.Mod_Elm;
import com.ensakh.sitegestion.entity.Module;
import java.util.List;

public interface ModuleService {
    List<Module> getAll();
    List<Mod_Elm> listModElm(Module module);
}
