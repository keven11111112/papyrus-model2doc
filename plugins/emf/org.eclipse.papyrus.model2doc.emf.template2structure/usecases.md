#plugin org.eclipse.papyrus.model2doc.emf.template2structure

* The developer must be able to register a generator to convert DocumentTemplate (from DocumentStructureTemplate metamodel) into Document (from DocumentStructure metamodel)
    * use the extension point structuregenerator.exsd to register a generator
        * define an id for it
        * register a class implementing the interface ITemplate2StructureGenerator 
* The developer must be able to define the mappers to use with a given generator
     * the extension point structuregenerator.exsd to register a mapper
        * define the generator for which the mapper is contributed using the generatorId field (must be an id defined for a generator in the previous step)
        * register a class extending AbstractTemplateToStructureMapper
* The developer must be able to access to the command ensuring the creation of a Document from a DocumentTemplate
      * use the factory Template2StructureCommandFactory