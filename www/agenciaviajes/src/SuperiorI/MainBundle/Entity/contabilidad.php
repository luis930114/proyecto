<?php

namespace Agencia\MainBundle\Entity;

use Doctrine\ORM\Mapping as ORM;

/**
 * contabilidad
 *
 * @ORM\Table()
 * @ORM\Entity
 */
class contabilidad
{
    /**
     * @var integer
     *
     * @ORM\Column(name="id", type="integer")
     * @ORM\Id
     * @ORM\GeneratedValue(strategy="AUTO")
     */
    private $id;

    /**
     * @var string
     *
     * @ORM\Column(name="nombre", type="string", length=255)
     */
    private $nombre;

    /**
     * @var string
     *
     * @ORM\Column(name="area_Asignada", type="string", length=255)
     */
    private $areaAsignada;

    /**
     * @var string
     *
     * @ORM\Column(name="Cargo", type="string", length=255)
     */
    private $cargo;


    /**
     * Get id
     *
     * @return integer
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * Set nombre
     *
     * @param string $nombre
     *
     * @return contabilidad
     */
    public function setNombre($nombre)
    {
        $this->nombre = $nombre;

        return $this;
    }

    /**
     * Get nombre
     *
     * @return string
     */
    public function getNombre()
    {
        return $this->nombre;
    }

    /**
     * Set areaAsignada
     *
     * @param string $areaAsignada
     *
     * @return contabilidad
     */
    public function setAreaAsignada($areaAsignada)
    {
        $this->areaAsignada = $areaAsignada;

        return $this;
    }

    /**
     * Get areaAsignada
     *
     * @return string
     */
    public function getAreaAsignada()
    {
        return $this->areaAsignada;
    }

    /**
     * Set cargo
     *
     * @param string $cargo
     *
     * @return contabilidad
     */
    public function setCargo($cargo)
    {
        $this->cargo = $cargo;

        return $this;
    }

    /**
     * Get cargo
     *
     * @return string
     */
    public function getCargo()
    {
        return $this->cargo;
    }
}

