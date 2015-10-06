<?php

namespace Agencia\MainBundle\Entity;

use Doctrine\ORM\Mapping as ORM;

/**
 * SuperiorInmediato
 *
 * @ORM\Table()
 * @ORM\Entity
 */
class SuperiorInmediato
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
     * @ORM\Column(name="Nombre", type="string", length=100)
     */
    private $nombre;

    /**
     * @var string
     *
     * @ORM\Column(name="Apellido", type="string", length=100)
     */
    private $apellido;

    /**
     * @var string
     *
     * @ORM\Column(name="Dependencia", type="string", length=100)
     */
    private $dependencia;

    /**
     * @var string
     *
     * @ORM\Column(name="Cargo", type="string", length=255)
     */
    private $cargo;

    /**
     * @var integer
     *
     * @ORM\Column(name="PagoPresupuestal", type="integer")
     */
    private $pagoPresupuestal;


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
     * @return SuperiorInmediato
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
     * Set apellido
     *
     * @param string $apellido
     *
     * @return SuperiorInmediato
     */
    public function setApellido($apellido)
    {
        $this->apellido = $apellido;

        return $this;
    }

    /**
     * Get apellido
     *
     * @return string
     */
    public function getApellido()
    {
        return $this->apellido;
    }

    /**
     * Set dependencia
     *
     * @param string $dependencia
     *
     * @return SuperiorInmediato
     */
    public function setDependencia($dependencia)
    {
        $this->dependencia = $dependencia;

        return $this;
    }

    /**
     * Get dependencia
     *
     * @return string
     */
    public function getDependencia()
    {
        return $this->dependencia;
    }

    /**
     * Set cargo
     *
     * @param string $cargo
     *
     * @return SuperiorInmediato
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

    /**
     * Set pagoPresupuestal
     *
     * @param integer $pagoPresupuestal
     *
     * @return SuperiorInmediato
     */
    public function setPagoPresupuestal($pagoPresupuestal)
    {
        $this->pagoPresupuestal = $pagoPresupuestal;

        return $this;
    }

    /**
     * Get pagoPresupuestal
     *
     * @return integer
     */
    public function getPagoPresupuestal()
    {
        return $this->pagoPresupuestal;
    }
}

